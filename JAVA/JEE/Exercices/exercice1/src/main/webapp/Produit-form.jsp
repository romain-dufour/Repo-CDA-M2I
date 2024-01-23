<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Creation de produit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Formulaire de creation d'un produit</h2>
    <form action="produit" method="post">
        <div class="mb-3">
            <label for="marque" class="form-label">Marque</label>
            <input type="text" class="form-control" id="marque" name="marque">
        </div>
        <div class="mb-3">
            <label for="reference" class="form-label">Reference</label>
            <input type="text" class="form-control" id="reference" name="reference">
        </div>
        <div class="mb-3">
            <label for="date_achat" class="form-label">Date d'achat</label>
            <input type="text" class="form-control" id="date_achat" name="date_achat">
        </div>
        <div class="mb-3">
            <label for="prix" class="form-label">Prix</label>
            <input type="number" class="form-control" id="prix" name="prix">
        </div>
        <div class="mb-3">
            <label for="stock" class="form-label">Stock</label>
            <input type="number" class="form-control" id="stock" name="stock">
        </div>


        <button  href="produit" type="submit" class="btn btn-primary">Créer</button>
    </form>
</div>
</body>
</html>
