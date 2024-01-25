<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste produits</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
<h1>La liste des produits</h1>
<div>
    <a href="Produit-form.jsp" class="btn btn-primary">Add</a>
</div>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Marque</th>
        <th scope="col">Reference</th>
        <th scope="col">dateAchat</th>
        <th scope="col">prix</th>
        <th scope="col">stock</th>


    </tr>
    </thead>
    <tbody>

    <c:forEach items="${produits}"  var="produit">

        <tr>
            <td>${produit.getMarque()}</td>
            <td>${produit.getReference()}</td>
            <td>${produit.getDateAchat()}</td>
            <td>${produit.getPrix()}</td>
            <td>${produit.getStock()}</td>
            <td><a class="btn btn-primary" href="produit/details?Id=${produit.getId()}">Details</a> </td>
            <td><a class="btn btn-danger" href="produit/delete?Id=${produit.getId()}&action=delete">Delete</a> </td>


        </tr>

    </c:forEach>

    </tbody>
</table>


<div class="container">
    <h2>Filtre</h2>
    <form action="produit" method="get">
        <div class="mb-3 col-2">
            <label for="prix" class="form-label">Prix</label>
            <input type="number" class="form-control" id="prix" name="prix">
        </div>
        <div class="mb-3 col-2">
            <label for="startDate" class="form-label">Date début</label>
            <input type="date" class="form-control" id="startDate" name="startDate">
        </div>
        <div class="mb-3 col-2">
            <label for="endDate" class="form-label">Date fin</label>
            <input type="date" class="form-control" id="endDate" name="endDate">
        </div>
        <button type="submit" class="btn btn-primary">Filtrer</button>
    </form>
</div>

</body>
</html>
