# Online Superhero Tracker
A simple Superhero track using Spring Boot REST API.
Add a superhero and track their civilian save count.

## Installation
1. Download, install and run [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/)
2. Click "Get from VCS" or File->New->Project From Version Control
3. Insert the following URL:
```
https://github.com/Toooo123/Online-Superhero-Tracker.git
```
4. Run Application

## Commands
Use [Postman](https://www.postman.com/downloads/) or Window's curl command:
```
curl -i -H "Content-Type: application/json" -X GET localhost:8080/hello
```

| HTTP method | URL | Description
| :---: | :---: | :---|
| GET | /hello | Greeting message |
| GET | /listAll | Return all superheroes as JSON array objects|
| POST | /add | Add new superhero JSON object |
| POST | /remove/id | Remove superhero with indicated id|
| POST | /update/id | Update superhero with id using JSON object |
| GET | /listTop3 | Return top 3 superheroes in JSON array object |

### Superhero JSON object
```json
{
  "name": "Cookie Monster",
  "heightInCm": 97.0,
  "civilianSaveCount": 0,
  "superPower": "Eating Cookies"
}
```



