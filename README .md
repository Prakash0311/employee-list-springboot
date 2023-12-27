Given five files,

- `EmployeeController.java`
- `EmployeeRepository.java`
- `EmployeeJpaService.java`
- `EmployeeJpaRepository.java`
- `Employee.java`

And also given a database file `employees` which contains the `EMPLOYEELIST` table.

#### EMPLOYEELIST Table

   |   Columns    |  Type   |
   | :----------: | :-----: |
   |  employeeId  | INTEGER |
   | employeeName |  TEXT   |
   |    email     |  TEXT   |
   |  department  |  TEXT   |


<MultiLineNote>
Use only `employeelist` as the table name in both query writing and in the model class within your code.
</MultiLineNote>

### Completion Instructions

- `Employee.java`: `Employee` class should contain the following attributes.

    |  Attribute   |  Type  |
    | :----------: | :----: |
    |  employeeId  |  int   |
    | employeeName | String |
    |    email     | String |
    |  department  | String |

- `EmployeeRepository.java`: Create an `interface` containing the required methods.
- `EmployeeJpaService.java`: Update the service class with logic for managing employee data.
- `EmployeeController.java`: Create the controller class to  handle HTTP requests. 
- `EmployeeJpaRepository.java`: Create an interface that extends the `JpaRpository` Interface.

Implement the following APIs.

### API 1

#### Path: `/employees`

#### Method: `GET`

#### Description:

Returns a list of all `employees` in the `employeeList`.

#### Response

```
[
    {
        "employeeId": 1,
        "employeeName": "John Doe",
        "email": "johndoe@example.com",
        "department": "Marketing"
    },
   ...
]
```

### API 2

#### Path: `/employees`

#### Method: `POST`

#### Description:

Creates a new employee in the `employeeList`. The `employeeId` is auto-incremented.

#### Request

```
{
    "employeeName": "Henry Nicholas",
    "email": "henrynicholas@example.com",
    "department": "IT"
}
```

#### Response

```
{
    "employeeId": 7,
    "employeeName": "Henry Nicholas",
    "email": "henrynicholas@example.com",
    "department": "IT"
}
```

### API 3

#### Path: `/employees/{employeeId}`

#### Method: `GET`

#### Description:

Returns an employee details based on the `employeeId`. 
If the given `employeeId` is not found in the `employeeList`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.


#### Success Response

```
{
    "employeeId": 2,
    "employeeName": "Jane Smith",
    "email": "janesmith@example.com",
    "department": "Human Resources"
}
```

### API 4

#### Path: `/employees/{employeeId}`

#### Method: `PUT`

#### Description:

Update the details of an employee in the `employeeList` based on the `employeeId` and return the updated employee details.
If the given `employeeId` is not found in the `employeeList`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.

#### Request

```
{
    "employeeName": "Steve Smith",
    "email": "stevesmith@example.com"
}
```

#### Success Response

```
{
    "employeeId": 2,
    "employeeName": "Steve Smith",
    "email": "stevesmith@example.com",
    "department": "Human Resources"
}
```

### API 5

#### Path: `/employees/{employeeId}`

#### Method: `DELETE`

#### Description:

Deletes an employee from the `employeeList`  based on the `employeeId`.
If the given `employeeId` is not found in the `employeeList`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.



**Do not modify the code in `EmployeeApplication.java`**

**Do not  modify anything in the `application.properties` file**

**Do not add any SQL files**
