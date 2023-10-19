import { useDispatch, useSelector } from 'react-redux'
import AddAlbumForm from './components/albums/AddAlbumForm'
import EditAlbumForm from './components/albums/EditAlbumForm'
import DeleteAlbumForm from './components/albums/DeleteAlbumForm'
import NavBar from './components/shared/Navbar'
import { useEffect } from 'react'
import { fetchAlbums } from './components/albums/albumsSlice'
import AlbumsDisplay from './components/albums/AlbumsDisplay'
import { setFormMode } from './components/albums/albumsSlice'
import Modal from './components/shared/Modal'

function App() {
  const dispatch = useDispatch()
  const user = useSelector(state => state.auth.user)
  const formMode = useSelector(state => state.albums.formMode)
  const albums = useSelector(state => state.albums.albums)

  useEffect(() => {
    dispatch(fetchAlbums())

  }, [])
  console.log(albums);
  return (
    <>
      {formMode === "add" && <Modal onClose={() => dispatch(setFormMode(""))}><AddAlbumForm /></Modal>}
      {formMode === "edit" && <Modal onClose={() => dispatch(setFormMode(""))}><EditAlbumForm /></Modal>}
      {formMode === "delete" && <Modal onClose={() => dispatch(setFormMode(""))}><DeleteAlbumForm /></Modal>}

      <header>
        <NavBar />
      </header>

      <main className='container'>
        <div className='row my-3'>
          <div className='col-10 offset-1 bg-dark rounded text-light p-3'>
            <div className='d-flex justify-content-between align-items-center'>
              <h3>Albums</h3>
              {user && <button className='btn btn-success' onClick={() => dispatch(setFormMode("add"))}>Add</button>}
              <div className='d-flex align-items-center'>
                <label htmlFor='filterSelect' className='form-label col-auto me-2'>Filtered by: </label>
                <select id='filterSelect' className='form-select col' placeholder='Select a filter'></select>
              </div>
            </div>
            <hr />
            <div className='row'>
              {
                albums.length === 0 ? (
                  <p>Il n'y a pas d'album</p>
                ) : albums.map(album => <div className='col-3' key={album.id}><AlbumsDisplay album={album} /></div>)
              }
            </div>


          </div>
        </div>
      </main>
      <hr />
    </>
  )
}

export default App