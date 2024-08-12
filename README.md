## Getting Started

1. Navigate to the root directory of the application.
2. Run the following Docker command to start the application and the database:

```bash
docker-compose -f ./docker/docker-compose.yml up
```

This command will start two containers: one for the application (port 8080) and one for the database (port 5432).

When the application is launched, the database change management tool Liquibase will automatically create five sample tasks in the database:

- 1, 'First task description', 1
- 2, 'Second task description', 2
- 3, 'Third task description', 3
- 4, 'Fourth task description', 4
- 5, 'Fifth task description', 5

You can use these sample tasks to test the functionality of the application's endpoints as it was on Codility. Here is an example request via curl:

```bash
curl --location --request PUT 'localhost:8080/tasks/1' \
--header 'Content-Type: application/json' \
--data '{
"description":"new description 1",
"priority": 11
}'
```