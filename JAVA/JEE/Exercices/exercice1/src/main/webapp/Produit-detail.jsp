<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details produit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>

<form action="produit" method="get">
    <div class="mb-3">

        <label for="marque" class="form-label">Marque</label>
        <input type="text" class="form-control" id="marque" name="marque" value="${produit.getId(1)}">
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


    <button  href="Produit-list.jsp" type="submit" class="btn btn-primary">Retour</button>
</form>
</body>
</html>
