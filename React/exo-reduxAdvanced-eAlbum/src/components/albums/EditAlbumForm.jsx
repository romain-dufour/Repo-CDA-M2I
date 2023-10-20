import { useDispatch, useSelector } from "react-redux"
import { editAlbums, setFormMode } from "./albumsSlice"
import { useRef , useState} from "react"
import { Rating } from 'react-simple-star-rating'


const EditAlbumForm = () => {
    const selectedAlbum = useSelector(state => state.albums.selectedAlbum)
    const [rating, setRating] = useState(selectedAlbum.score)
    const dispatch = useDispatch()
    const titleRef = useRef()
    const dateRef = useRef()
    const artistRef = useRef()
    // const scoreRef = useRef()
    const urlRef = useRef()
    const priceRef = useRef()

    const handleRating = (rate) => {
        console.log(rate);
        setRating(rate)
    }

    const SubmitFormHandler = (event) => {
        event.preventDefault()

        const newAlbum = {
            id: selectedAlbum.id,
            title: titleRef.current.value,
            releaseDate: dateRef.current.value,
            artist: artistRef.current.value,
            score: rating,
            coverURL: urlRef.current.value,
            price: priceRef.current.value
        }

        dispatch(editAlbums(newAlbum))
        dispatch(setFormMode(""))
    }
  
    return(
        <>
            <h1>Edit Album</h1>
            <hr />
            <form onSubmit={SubmitFormHandler} className="container">
                <div className="mb-3">
                    <label htmlFor="title" className="form-label">Title:</label>
                    <input type="text" className="form-control" required ref={titleRef} defaultValue={selectedAlbum.title}/>
                </div>
                <div className="mb-3">
                    <label htmlFor="releaseDate" className="form-label">Release Date:</label>
                    <input type="date" className="form-control" required ref={dateRef} defaultValue={selectedAlbum.releaseDate} />
                </div>
                <div className="mb-3">
                    <label htmlFor="artist" className="form-label">Artist:</label>
                    <input type="text" className="form-control" required ref={artistRef} defaultValue={selectedAlbum.artist} />
                </div>

                <div className="mb-3">
                    <label htmlFor="score" className="form-label">Score:</label>
                    <Rating onClick={handleRating} size={20}  initialValue={selectedAlbum.score} required/>
                </div>
                <div className="mb-3">
                    <label htmlFor="coverURL" className="form-label">URL of the cover:</label>
                    <input type="text" className="form-control" required ref={urlRef} defaultValue={selectedAlbum.coverURL}/>
                </div>
                <div className="mb-3">
                    <label htmlFor="price" className="form-label">Price of the album:</label>
                    <input type="number" className="form-control" required ref={priceRef} defaultValue={selectedAlbum.price}/>
                </div>
                <div className="text-end">
                    <button className="btn btn-warning">Edit</button>
                </div>
            </form>
        </>
    )
}
export default EditAlbumForm