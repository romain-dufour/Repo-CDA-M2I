

const Alert = (couleur, message, icone) => {
    let textBouton = message.textBouton ?? 'probleme'
    // let alert = "alert"
    let couleurBouton = couleur.couleurBouton ?? "alert alert-danger"
    let iconeBouton = icone.iconeBouton ?? '<i class="bi bi-exclamation-triangle"></i>'
  
    return (
        <>
            <div className={ couleurBouton } role="alert"> 
            {iconeBouton} 
                {textBouton}

            </div>
        </>


        // < button type="button" className={ {btn}+ " " +{couleurBouton}}  >{textBouton}</button> 
    )
}


{/* <div class="alert alert-danger text-center" role="alert">
    Un probleme est survenu
</div> */}

export default Alert