const result = document.querySelector(".result");

let email = "contact@teams.fr",
    mdp = "leLundiAuSoleil",
    emailSaisi="",
    mdpSaisi="";

emailSaisi= prompt("Veuillez saisir votre Email :")
mdpSaisi= prompt("Veuillez saisir votre mot de passe :")

if (emailSaisi===email & mdpSaisi===mdp) {
    result.innerHTML = `Bienvenue sur votre espace sécurisé`
}