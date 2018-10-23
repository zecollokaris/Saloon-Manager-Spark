#                                                   SALOON-MANAGER! :haircut:

# DISPLAY

# AUTHOR

COLLINS KARIUKI


## DESCRIPTION :page_with_curl:


This is a simple Hair-Salon management system that stores stylists and clients.The manager is be able to add a list of the stylists, and for each stylist, add clients who will be attended to by that stylist. The stylists work independently, so each client only belongs to a single stylist.

[Check-Out App!](https://saloon-manager.herokuapp.com/)

## User Story

- Manager can add a Sylist.

- Manager can add a Client under a single Stylist.

- Manager can Contact and information about the Client.

- Manager can delete both Stylist and Client.

## PRE-REQUISITES.

A couple of things to get you started:

1. Ensure you have [Java](https://java.com/en/download/) installed

A simple way to install Java is using [sdkman](https://sdkman.io/).

Simply follow the instructions to have _sdkman_ installed and install java:

```bash
sdk install java
```

2. [Gradle](https://gradle.org/)

Gradle is used as the build tool and can be installed with sdkman:

```bash
sdk install gradle
```

3. Postgresql

Ensure you have installed postgresql on your localmachine

This will be used as the System Database for Hair Saloon.

Once u Have it installed Follow the below Instructions.

- Open your bash terminal

NOTE!

The ``` $ ``` and ``` =# ``` are only used to indicate the current location!... DO NOT TYPE THEM!

- Initialize postgresql Database using the below commands.

```
$ psql
```

- Create DataBase

```
=# CREATE DATABASE saloon_manager;
```

- CREATE Test DataBase

```
=# CREATE DATABASE wildlife_tracker_test WITH TEMPLATE saloon_manager_test;
```

- Connect to DataBase

```
=# \c saloon_test
```

- Create Stylist Table

```
=# CREATE TABLE stylist (id INT PRIMARY KEY,first_name VARCHAR,second_name VARCHAR,last_name VARCHAR, phone_number VARCHAR, email VARCHAR);
```

- Create Client Table

```
CREATE TABLE client (id SERAIL PRIMARY KEY,first_name VARCHAR,mname VARCHAR,lname VARCHAR,stylist VARCHAR,phoneno VARCHAR, email VARCHAR);

```


# **SETUP/INSTALLATION!**

**{follow the below instructions for set up.}**

1. You will need Internet connection.

2. You need to get into the Hero-Squad Repository.

Link:-> ```https://github.com/zecollokaris/Hero-Squad-Spark```

3. From there you can access the Hero-Squad.

4. **Clone** the project.

5. **get into project folder** (cd into project).

6. If you have all the **Pre-requisites** you can run the application.

```
gradle run
```
### TECHNOLOGIES USED:

- **[Java](https://java.com/en/download/) - source language.**

- **[Gradle](https://gradle.org/) for dependency management and running tasks.**

- Bootstrap.

- Cascading Style Sheets.

- Apache Velocity Engine.

## Support & Contact

- Mobile number: (+254) 798731203

- Email Address: collo.kariss@gmail.com

- github-username: zecollokaris

## License

The app is licensed by MIT. [**HERE**](LICENSE)
