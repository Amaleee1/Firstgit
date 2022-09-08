Feature:Searching And Booking In Adactin Hotel App

Scenario Outline:Login To Adactin Hotel App

Given User Launch The Url Of Adactin Hotel App
When User Enter The "<Username>" In The Username Field
And User Enter The "<Password>" In The Password Field
Then User Click The Login Button And It Navigate The Search Hotel Page
Examples:
|Username|Password|
|abc|cab|
|cab|abc|
|AmalRaja|Selenium123|
 
Scenario Outline:Search The Hotel

When User Select The Location  As "<Location>" From Location Field
Examples:
|Location|
|London|
|New York|
|Paris|
Scenario Outline:Search The Hotel
And User Select The Hotel  As "<hotels>" From Hotel Field
Examples:
|hotels|
|Hotel Creek|
|Hotel Hervey|
|Hotel Sunshine|
Scenario Outline:Search The Hotel
And User Select The Room Type As "<Room>"
Examples:
|Room|
|Deluxe|
|Double|
Scenario Outline:Search The Hotel
And User Select The No Of Rooms In The Select No Of Rooms Field As "<No>"
Examples:
|No|
|1|
|2|
Scenario Outline:Search The Hotel
And User Fix The date in the Field Of Check In Date As "<In>" 
Examples:
|In|
|02/09/2022|
|03/09/2022|
Scenario Outline:Search The Hotel
And User Fix The date in the Field Of Check Out Date As "<Out>" 
Examples:
|Out|
|04/09/2022|
|05/09/2022|
Scenario Outline:Search The Hotel
And User Select Adults Per Room As "<Adult>"
Examples:
|Adult|
|1|
|2|
Scenario Outline:Search The Hotel
And User Select Children Per Room As "<Child>"
Examples:
|Child|
|1|
|2|
 Scenario:Search The Hotel
Then User Click the Search Button

Scenario:Select The Hotel
When User Click The Hotel In The Field Of Select  As "Sunshine" 
Then User Click the Continue Button

Scenario:Book A Hotel

When User User Enter The First Name As "Amal"
And User Enter The Last Name As "Raja"
And User Enter The Address As "Dindigul"
And User Enter The CreditCard Number As "1234567891234856"
And User Select Credit Card Type As "VISA"
And User User Select A Month In The Field Of Select Month Field As "May" 
And User User Select A Year In The Field Of Select Year Field As "2022"  
And User Enter The CVV Number As "321"
Then User Click the Book Now Button

Scenario:Booked Page













