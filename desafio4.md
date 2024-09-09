CREATE TABLE clients (
    id INT AUTO_INCREMENT PRIMARY KEY,  
    name VARCHAR(255),
    telephones VARCHAR(255),  
    state CHAR(2),  
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP  
);


CREATE TABLE telephones (
    id INT AUTO_INCREMENT PRIMARY KEY,  
    numberTelephone VARCHAR(255),
    typeTelephone VARCHAR(255),  
    client INT,  
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  
    FOREIGN KEY (client) REFERENCES client(id)  
);

```
select c.name, c.state, t,typeTelephone, t.numberTelephone from clients c
left join telephone t on c.id == t.client
where c.state == "SP"
```

[](https://github.com/andrepixel/desafio-targetsistemas/blob/main/database.png)
