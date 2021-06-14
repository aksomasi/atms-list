# MobiQuity Code Challenge Application API
Backend Technical Test Overview
 ● Create a spring boot application to expose the REST APIs with the following definition.
 ● The application should invoke an external service to gather a list of atms:
https://www.ing.nl/api/locator/atms/
 ● The application should expose following APIs and return a well formed JSON response
○ An API to get a list of all the atms
○ An API to filter the atms by city
 ● Apply clean code standards and/or principals as much as possible during the implementation.

## Note:
Angular Application was build and pasted the bundle into backend project manually. if we run this project as springboot app. directly your going to see UI application in the following url
http://localhost:8080/

## Tech Stack
| Technology | Version | Purpose |
| ------ | ------ | ------ |
| Java | 11| Programming Language |
| SpringBoot | 2.4.3 | Application Framework |
| Embedded Tomcat Server | 9 | To Deploy Application |
| Maven |   | Build Tool |
| Swagger  | 2.7 | API Dcoumentaion and Testing |
| Junit, Mockito | 5 | Unit Test Cases |
| Log4j | 2.1.3 | To maintain Logs |
| Type Script | 2.1.3 | Client Side Language |
| Angular | 12 | Application Framework |
| Prime Ng | 12 | UI Tool Kit |

## Rest Apis Info
here i used 4 apis, 2 are related to formatted data and other 2 are related to Originaldata...
here im providing uri's for formatted data.
follwoing are the request and responses
##### Request: GET - getAllAtms/formatted
http://localhost:8080/getAllAtms/formatted
##### Response:
[{"city":"Marken","postalcode":"1156 DG","street":"Kruisbaakweg","functionality":"Geldautomaat"},{"city":"SLAGHAREN","postalcode":"7776 PB","street":"ZWARTE DIJK","functionality":"Geldautomaat"}]

##### Request: GET - getAllAtmsByCity/formatted - Params: city
http://localhost:8080/getAllAtmsByCity/formatted?city=Leiden
##### Response:
[{"city":"Marken","postalcode":"1156 DG","street":"Kruisbaakweg","functionality":"Geldautomaat"},{"city":"SLAGHAREN","postalcode":"7776 PB","street":"ZWARTE DIJK","functionality":"Geldautomaat"}]

##### swagger url:
http://localhost:8080/swagger-ui.html

![swagger](https://user-images.githubusercontent.com/53008196/121884763-ee981280-cd30-11eb-8f71-d749896154aa.JPG)

```sh
UI Angular - List of All Cities with client side filtration with pagination
```
![Atms's-lList](https://user-images.githubusercontent.com/53008196/121884913-22733800-cd31-11eb-99ad-e8706baa8ba1.JPG)
![client-side filteration](https://user-images.githubusercontent.com/53008196/121884933-27d08280-cd31-11eb-94ac-b03f874abcd9.JPG)


```sh
UI Angular - List of Atm Centers By City  with client side filtration with pagination
```
![select city ](https://user-images.githubusercontent.com/53008196/121885028-48004180-cd31-11eb-903d-b36ce300c19c.JPG)
![Atms's-lList By city](https://user-images.githubusercontent.com/53008196/121885039-4cc4f580-cd31-11eb-881a-778acf4a8029.JPG)


```sh
Swagger Api for 2 Api's
```
![getAllAtmsList](https://user-images.githubusercontent.com/53008196/121885144-6c5c1e00-cd31-11eb-82c5-2255d182721d.JPG)
![getAtmsListByCity](https://user-images.githubusercontent.com/53008196/121885158-70883b80-cd31-11eb-8e80-60e6bd51fa85.JPG)


```sh
Test Cases Results
```
![test-cases](https://user-images.githubusercontent.com/53008196/121885187-7da52a80-cd31-11eb-8049-5d3492df47b2.JPG)

```sh
Code Coverage
```
![code-coverage](https://user-images.githubusercontent.com/53008196/121885244-91e92780-cd31-11eb-855e-a1d130bb6ab6.JPG)

```sh
Code Coverage
```
//  Code Coverage Screenshot
```sh
H2 Database 
```
//  H2 Database  Screenshot

