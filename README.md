# Projet_microservice

# Création des databases :
- PostgreSQL :
=> La database se crée automatiquement avec les requetes lors des insertions de données (étape : "Insertion dans les databases postgreSQL")


- MongoDB :
=> Lancer MongoDBCompass
=> Créer une nouvelle connexion
=> Créer une nouvelle database (SportJO)
=> Créer les collections sports et sites 

# Application.properties
- SportService : Compléter le nom de la collection MongoDB (sports)
- SiteService : Compléter le nom de la collection MongoDB (sites)
- PlanningService : Compléter les informations de connexion à la base de donnée PostgreSQL (databse, user et password)
- UserService : Compléter les informations de connexion à la base de donnée PostgreSQL (databse, user et password)

# Insertion des fichiers .json dans les collections MongoDB
- Ajouter aux collections sports et sites les données des fichiers data_sports.json et data_sites.json via le bouton "add data"

# Insertion dans les databases postgreSQL
- Lancer les services
- Drop les tables existantes dans la database
- Lancer les fichers data.sql de PlanningService et UserService
- /!\ en cas d'erreur lors des requetes create et insert de calendrier, re-drop la table calendrier puis relancer la requete concernée
