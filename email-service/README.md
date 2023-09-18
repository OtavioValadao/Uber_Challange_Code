# Serviço de Envio de Emails

## Desafio de Código - UBER
Você já se perguntou como criar um serviço de envio de emails confiável e flexível? Nosso desafio é desenvolver um serviço que aceite informações essenciais e envie emails, proporcionando uma abstração entre dois provedores de serviços de email diferentes. Se um dos serviços falhar, nosso serviço poderá alternar rapidamente para outro provedor, garantindo que seus clientes não sejam afetados.

## Tecnologias Utilizadas

Nossa solução utiliza as seguintes tecnologias:

- [Spring Boot](https://spring.io/projects/spring-boot) - Um framework robusto para o desenvolvimento de aplicativos Java.
- [Insomnia](https://insomnia.rest/download) e [Postman](https://www.postman.com/) - Ferramentas que permitem enviar solicitações HTTP e testar o serviço facilmente.

## Como Utilizar

Siga estas etapas simples para começar a utilizar nosso serviço de envio de emails:

1. Faça o download do projeto para sua máquina.

2. Abra o projeto em sua IDE de preferência e inicie a aplicação.

3. Após a inicialização bem-sucedida, abra sua ferramenta de solicitações HTTP favorita, como o Insomnia ou o Postman.

4. Envie uma solicitação POST para o seguinte endpoint: `https://localhost:8080/api/email`.

5. No corpo da solicitação, forneça as informações necessárias em formato JSON:

OBS: A lista de emails que irá receber, devem ser usuarios cadastrados na AWS para o proprio fazer gerenciamento.

```json
{
    "emailsToReceive": ["email1@example.com", "email2@example.com"],
    "subject": "Assunto do Email",
    "body": "Corpo do Email"
}
```

**Lembrando que nosso serviço é totalmente gratuito e de código aberto!**

---

Queremos facilitar o envio de emails para você. Nosso serviço é altamente flexível e confiável, com a capacidade de se adaptar rapidamente a diferentes provedores de serviços de email. Experimente agora e simplifique o processo de envio de emails em seu projeto!