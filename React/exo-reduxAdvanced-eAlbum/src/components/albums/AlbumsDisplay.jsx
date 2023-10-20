import { useSelector, useDispatch } from "react-redux"
import { setSelectedAlbum, setFormMode } from "./albumsSlice"
import {Rating} from 'react-simple-star-rating'
import { useState } from "react"




const AlbumsDisplay = (props) => {
    const album = props.album
    const dispatch = useDispatch()
    const user = useSelector(state => state.auth.user)
    const [rating, setRating] = useState(album.score)

    const editAlbumHandler = () => {
        dispatch(setSelectedAlbum(album))
        dispatch(setFormMode("edit"))
    }

    const deleteAlbumHandler = () => {
        dispatch(setSelectedAlbum(album))
        dispatch(setFormMode("delete"))
    }
    const handleRating = (rate) => {
        console.log(rate);
        setRating(rate)

    }
//     const handleRating = () => {
// dispatch(setSelectedAlbum(album))
//     }
        return (
            <div className="mt-2 border border-secondary p-3 rounded text-center">
                <div className="d-flex align-items-center">
                    <h5>{album.title}</h5>
                </div>
                <div className="rounded overflow-hidden">
                    <img src={album.coverURL} alt="" className="w-100" />
                </div>
                <div className="row g-1 mt-1">
                    <div className="d-flex align-items-center">
                        <p className="fw-bolder">Artist: </p>
                        <span className="ms-auto d-flex align-items-center"><p>{album.artist}</p></span>
                    </div>
                    <hr />
                    <div className="d-flex align-items-center">
                        <p>Release date: </p>
                        <span className="ms-auto"><p>{album.releaseDate}</p></span>
                    </div>
                    <hr />
                    <div className="d-flex align-items-center">
                        <p>Score: </p>
                            <div className="ms-auto ">
                                <Rating className=" " size="20" initialValue={album.score}  readonly={true}></Rating>
                            </div>
                    </div>
                    <hr />
                    <div className="d-flex align-items-center">
                        <p>Price: </p>
                        <span className="ms-auto"><p>${album.price}</p></span>
                    </div>
                </div>
                {
                    user &&
                    <div className="d-flex">
                        <button className="btn btn-warning" onClick={() => editAlbumHandler()}>Edit</button>
                        <button className="btn btn-danger ms-auto" onClick={() => deleteAlbumHandler()}>Delete</button>
                    </div>
                }
            </div>
        )

}

export default AlbumsDisplay