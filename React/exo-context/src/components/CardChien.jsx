import { useContext } from "react"
import { MonContext } from "../context/MonContext"

const CardChien = () => {

    const [dogName] = useContext(MonContext)
    const [dogRace] = useContext(MonContext)
    // const [dogDate] = useContext(MonContext.dogDate)
    // const [dogPhoto] = useContext(MonContext.dogPhoto)

    // const DogInformations = () =>{
    //     let listInformations =[]
    //     let dogNameList = dogName
    //     let dogRaceList = dogRace
    //     let dogDateList = dogDate
    //     let dogPhotoList = dogPhoto
    //     listInformations.push(dogNameList)
    //     listInformations.push(dogRaceList)
    //     listInformations.push(dogDateList)
    //     listInformations.push(dogPhotoList)
    //     console.table(listInformations);
    // }
    return (
        // <div>
        //     {/* <div>   <img src={(dogImage)} alt="" />
        //</div> */}
        <>
            <p>
               le nom du chien est <b>{dogName}</b>
            </p>
            <p>
               la race du chien est <b>{dogRace}</b>
            </p>
        </>

        // <div>
        //     {/* <button className="Btn btn-outline-success" onClick={DogInformations()}>Details</button> */}
        // </div>


    )
}

export default CardChien