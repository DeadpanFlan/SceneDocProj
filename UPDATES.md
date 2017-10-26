October 25, 2017
================
- Implemented the Angular portion of the application
	- App initializes with test data being displayed
- One particular caveat at this point is that there is no validation on a new user, meaning you can submit blank text fields
	- Other fields have defaults (Gender=Unknown, Flags=False, Datetime=current)
- Implemented delete function in API as it was missed before
- Added support for running with Maven in addition to Gradle

October 24, 2017 - Evening
==========================
- Instead of building my own SQL queries, opted to use JPA CrudRepository 
- Removed Service as its actions are now completed by CrudRepository
- Had to rename Table in Schema and data as JPA expects the table name to reflect the object name
- Implemented API methods to:
	- Get all Users
	- Get Single User
	- Create a new User
	- Update Existing User
- Should be enough to get Started on Angular portion of application

October 24, 2017 - Morning
========================
- Service Now contains methods for fetching all or a single User
	- Service uses JDBC to access H2 Database, which has been set up with default values using the application.yml file
	- schema-h2.sql defines the table storing Users, while data-h2.sql adds users to table
- Controller uses service to process Database requests
- Property names conflicted with RowMapper (Particularly isAdmin and isActive fields), so they were renamed to resolve issue

October 23, 2017
================
- Using Eclipse generated a blank Spring Boot project with support for H2, RESTful Web, and JDBC
- Started work on a REST API
	- User Model
	- User Service to handle DB work
	- User Controller to implement REST Methods
