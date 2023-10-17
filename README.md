# QuickStay Pro - Hotel Booking and Rental Web Application

QuickStay Pro is a Java-based web application built with JSP and Servlets for hotel booking and room rental management.

## Prerequisites

Before you get started with QuickStay Pro, make sure you have the following requirements in place:

1. **Tomcat 9 Server**: Ensure that you have Tomcat 9 installed and properly configured on your system. You can download and set up Tomcat from [Tomcat's official website](http://tomcat.apache.org/).

2. **Maven Project**: QuickStay Pro is a Maven project. If you haven't already, install Apache Maven 3.4 or later. You can download Maven from [Maven's official website](https://maven.apache.org/).

3. **JSP Files**: All JSP files are located in the 'webapp' folder.

4. **Database Configuration**: The MySQL database connection details are specified in the 'persistence.xml' file. You can find this file at 'webapp > WEB-INF > classes > META-INF > persistence.xml'.

5. **Dependencies**: Ensure that you have the necessary dependencies added to your project's 'pom.xml' file. The required dependencies include Servlet, Hibernate, and MySQL drivers.

## Getting Started

Follow these steps to set up and run QuickStay Pro on your local machine:

1. **Clone the Repository**: Clone this GitHub repository to your local system using the following command:

   ```shell
   git clone https://github.com/yourusername/quickstay-pro.git
   ```

2. **Configure Database**: Edit the 'persistence.xml' file located at 'webapp > WEB-INF > classes > META-INF > persistence.xml' to match your MySQL database configuration.

3. **Build the Project**: Open a terminal in the project's root directory and run the following Maven command to build the project:

   ```shell
   mvn clean install
   ```

4. **Deploy to Tomcat**: Deploy the project to your Tomcat 9 server. You can copy the generated WAR file from the 'target' directory to the 'webapps' directory of your Tomcat installation.

5. **Start Tomcat**: Start your Tomcat server.

6. **Access the Application**: Open a web browser and navigate to `http://localhost:8080/quickstay-pro` to access the QuickStay Pro web application.

## Contributors

- [Vedant Yadav](https://github.com/VedantY17)

## Acknowledgments

- Special thanks to the [Apache Tomcat](http://tomcat.apache.org/), [Apache Maven](https://maven.apache.org/), and [MySQL](https://www.mysql.com/) communities for their excellent tools and resources.
