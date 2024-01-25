<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add produit</title>
    <jsp:include page="../includes/head.jsp" />

</head>
<body>
<jsp:include page="../includes/header.jsp"/>
<div class="container mt-4">
    <center>
        <h2>Ajouter un produit </h2>
    </center>
    <div>
        <form action="insert" method="post">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="identifiant">identifiant</label>
                    <input type="text" class="form-control" id="identifiant" name="identifiant">
                </div>
                <div class="form-group col-md-6">
                    <label for="password">Mot de passe</label>
                    <input type="password" class="form-control" id="password" name="password">
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Se connecter</button>
            <button type="submit" class="btn btn-success">S'inscrire</button>
        </form>
    </div>
</div>
</body>
</html>
