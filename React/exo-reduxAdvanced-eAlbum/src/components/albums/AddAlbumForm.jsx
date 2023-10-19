import { useRef } from "react"
import { useDispatch } from "react-redux"
import { postAlbums } from "./albumsSlice"



const AddAlbumForm = () => {
    const dispatch = useDispatch()
    const titleRef = useRef()
    const dateRef = useRef()
    const artistRef = useRef()
    const scoreRef = useRef()
    const urlRef = useRef()
    const priceRef = useRef()

    const SubmitFormHandler = (event) => {
        event.preventDefault()

        const newAlbum = {
            title: titleRef.current.value,
            releaseDate: dateRef.current.value,
            artist: artistRef.current.value,
            score: scoreRef.current.value,
            coverURL: urlRef.current.value,
            price: priceRef.current.value
        }

        dispatch(postAlbums(newAlbum))
    }
    return (
        <>
            <h1>Add Album</h1>
            <hr />
            <form onSubmit={SubmitFormHandler} className="container">
                <div className="mb-3">
                    <label htmlFor="title" className="form-label">Title:</label>
                    <input type="text" className="form-control" required ref={titleRef} />
                </div>
                <div className="mb-3">
                    <label htmlFor="releaseDate" className="form-label">Release Date:</label>
                    <input type="date" className="form-control" required ref={dateRef} />
                </div>
                <div className="mb-3">
                    <label htmlFor="artist" className="form-label">Artist:</label>
                    <input type="text" className="form-control" required ref={artistRef} />
                </div>
                <div className="mb-3">
                    <label htmlFor="score" className="form-label">Score:</label>
                    <input type="number" className="form-control" min={0} max={5} required ref={scoreRef} />
                </div>
                <div className="mb-3">
                    <label htmlFor="coverURL" className="form-label">URL of the cover:</label>
                    <input type="text" className="form-control" required ref={urlRef} />
                </div>
                <div className="mb-3">
                    <label htmlFor="price" className="form-label">Price of the album:</label>
                    <input type="number" className="form-control" required ref={priceRef} />
                </div>
                <div className="text-end">
                    <button className="btn btn-success">Add</button>
                </div>
            </form>
        </>
    )
}

export default AddAlbumForm