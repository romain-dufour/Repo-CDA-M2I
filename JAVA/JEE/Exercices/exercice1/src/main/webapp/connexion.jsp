<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connexion</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head><body>

<form action="produit" method="delete">
    <div class="mb-3">
        <label for="identifiant" class="form-label">Identifiant</label>
        <input type="text" class="form-control" id="identifiant" name="identifiant">
    </div>
    <div class="mb-3">
        <label for="mdp" class="form-label">Mot de passe</label>
        <input type="password" class="form-control" id="mdp" name="mdp">
    </div>

    <button  href="produit" type="submit" class="btn btn-primary">Connexion</button>

    <button  href="produit" type="submit" class="btn btn-success">Inscription</button>
</form>
</body>
</html>
