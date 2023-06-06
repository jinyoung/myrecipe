# 

## Model
www.msaez.io/#/storming/02014a845cd442fdeb80387add58888c

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- Customer Management
- Recipe and Manual Management
- Delivery and Courier Management
- Payment Management


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- Customer Management
```
 http :8088/customers id="id" name="name" email="email" phone="phone" address="address" dietaryPreferences="dietaryPreferences" 
```
- Recipe and Manual Management
```
 http :8088/recipes id="id" name="name" description="description" ingredients="ingredients" cookingSteps="cookingSteps" 
 http :8088/manuals id="id" recipeId="recipeId" customerId="customerId" isComplete="isComplete" 
```
- Delivery and Courier Management
```
 http :8088/deliveries id="id" manualId="manualId" deliveryDate="deliveryDate" deliveryAddress="deliveryAddress" isDelivered="isDelivered" 
```
- Payment Management
```
 http :8088/payments id="id" manualId="manualId" amount="amount" paidDate="paidDate" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

