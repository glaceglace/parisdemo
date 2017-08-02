# Spring boot demo

Une demonstration de RestAPi en utilisant Spring boot et mongodb

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

JDK1.8,Maven3.5 et Tomcat 8.0


### Installing

La base de données est sur cloud.mongo.com, cependant vous avez besoin de Tomcat pour metre en place un serveur local.
Vous avez besoin aussi de Maven pour compiler ou installer ce projet


Vous avez deux façon à metre en place ce projet

1. Téléchargez et importez dans un IDE, eclipse est recommandé, lancez directement avec l'IDE 

2. Téléchargez et extraire les fichers, utilsez la commande ci-dessous dans la répertoire ou le ficher pom.xml exsite

```
mvn spring-boot:run
```
Vous réussissez si vous avez des réponse ci-dessous quand vous entrez localhost:8080 dans un broswer

```
{
  "_links" : {
    "cities" : {
      "href" : "http://localhost:8080/cities{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8080/profile"
    }
  }
}
```


## Running the tests


Dès que le projet est en marche. Vous avez deux façon à récupérer les résultats en json

1. Façon de classpath: Tapez localhost:8080/<city> sur browser, <city> à ce moment peut être paris ou iledefrance.
2. Façon de paramètre: Tapez localhost:8080/city?name=<city>. Pareil, <city> peut être paris ou iledefrance.


## Built With
* [Spring boot](https://projects.spring.io/spring-boot/) - The web framework
* [Tomcat](http://tomcat.apache.org/) - Web Server
* [MongoDB](https://www.mongodb.com) - Database NOSQL
* [Maven](https://maven.apache.org/) - Dependency Management


