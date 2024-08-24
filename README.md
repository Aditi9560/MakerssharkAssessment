"# MakerssharkAssessment" 
This project include querySuppliers search API that allows buyers to find manufacturers based on customized requirements such as location, nature of business, and manufacturing processes. Additionally, it includes an API to save supplier details also.

**API Endpoints:**
1)**Quicksupplier search**
Endpoint:http://localhost:9090/api/supplier/query?pagenumber=1&pagesize=2
Method: POST
Description: Retrieves a list of manufacturers based on the specified criteria.
request body:

    {
        "location": "Kolkata",
        "natureOfBusiness": "Automobile",
        "manufacturingProcesses": "small"
    }

2)**Save Supplier**
Endpoint: http://localhost:9090/api/supplier/save
Method: POST
Description: Saves the details of a supplier.
request body:

      {
        "companyName": "XYZ Manufactur\ning",
        "website": null,
        "location": "Kolkata",
        "natureOfBusiness": "Automobile",
        "manufacturingProcesses": "small"
    }

**Database Configuration**:

**Create the Database:**
CREATE DATABASE makersharks;

**Configure the Application**
Configure the database connection in the application.properties file located in the src/main/resources directory.

`server.port=9090`

`spring.datasource.url=jdbc:mysql://localhost:3306/makersharks`

`spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver`

`spring.datasource.username=root`

`spring.datasource.password=password`

`spring.jpa.hibernate.ddl-auto=update`

`spring.jpa.show-sql=true`





