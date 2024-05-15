# Activité Pratique Microservices Multiconnecteurs avec gRPC, SOAP, GraphQL et REST

Ce projet illustre la création d'un système distribué basé sur deux micro-services : le service client et le service compte. Ces services sont interconnectés en utilisant les quatre générations de technologies web : REST, GraphQL, SOAP et gRPC, démontrant ainsi une intégration multi-technologique dans un environnement de micro-services.

## Introduction

Ce projet vise à implémenter et à démontrer l'interconnexion de services web utilisant différentes technologies dans un seul système distribué. Les services développés dans ce projet comprennent :

- **Service Client (Customer Service)** : Gère les informations des clients.
- **Service Compte (Account Service)** : Gère les informations des comptes.

## Architecture

Les services sont conçus pour communiquer en utilisant quatre méthodes différentes :
- **REST** : Communication standardisée utilisant des requêtes HTTP.
- **GraphQL** : Permet des requêtes plus flexibles et optimisées.
- **SOAP** : Utilise le protocole standard pour les échanges d'informations structurées.
- **gRPC** : Basé sur HTTP/2 pour des appels de procédure distante efficaces.

## Technologies Utilisées

- Spring Boot
- GraphQL Java Tools
- Apache CXF (pour SOAP)
- gRPC Java


Ce projet démontre une approche complète de la mise en œuvre et de l'intégration de diverses technologies de services web, mettant en évidence la polyvalence et l'interopérabilité des architectures modernes de microservices.
