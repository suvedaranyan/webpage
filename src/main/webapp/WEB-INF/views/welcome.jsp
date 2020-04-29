<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello ${name}!</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
    <h2 class="hello-title">Hello ${name}!</h2>
    <script src="/js/main.js"></script>
    
    <h1 style="color: red;">
    <a onclick="document.forms['logoutForm'].submit()">Logout</a>
   </h1>
    <form id="logoutForm" method="POST" action="/logout">
    </form>
    
</body>
</html>