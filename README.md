=========

## Login and Registration Example Project with Spring Security
If you're already a student of Learn Spring Security, you can get started diving deeper into registration with Module 2 </br>
If you're not yet a student, you can get access to the course here: http://bit.ly/github-lss
</br></br></br>


### Build and Deploy the Project
```
mvn clean install
```

This is a Spring Boot project, so you can deploy it by simply using the main class: `Application.java`



### Set up MySQL
```
mysql -u root -p 
> CREATE USER 'tutorialuser'@'localhost' IDENTIFIED BY 'tutorialmy5ql';
> GRANT ALL PRIVILEGES ON *.* TO 'tutorialuser'@'localhost';
> FLUSH PRIVILEGES;
```


### Set up Email

You need to configure the email by providing your own username and password in application.properties
You also need to use your own host, you can use Amazon or Google for example.
You may also setup an email server locally.  See "email.properties.localhost.sample" for more details.
