
function Contact()  {
    const submitFormHandler = (event) => {
        event.preventDefault()
    }
    return(
        <>
<form onSubmit={submitFormHandler}>
<h3>Name</h3>
<input type="text"></input>
<h3>Firstname</h3>
<input type="text"></input>
<h3>Comments</h3>
<input type="textarea" size={"30px"}></input>

</form>
        </>
    )
}

export default Contact