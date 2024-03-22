import React, { useState } from 'react';

function UpdateTodoModal({ todo, onSave, onCancel }) {
  const [title, setTitle] = useState(todo?.title);
  const [description, setDescription] = useState(todo?.description);
  const [status, setStatus] = useState(todo?.status);


  const handleSubmit = (e) => {
    e.preventDefault();
    onSave(todo.id, { title, description, status });
  };

  return (
    <div className="modal" style={{ display: 'block', backgroundColor: 'rgba(0,0,0,0.5)' }}>
      <div className="modal-dialog">
        <div className="modal-content">
          <div className="modal-header">
            <h5 className="modal-title">Update todo</h5>
            <button type="button" className="close" onClick={onCancel}>
              <span>&times;</span>
            </button>
          </div>
          <div className="modal-body">
            <form onSubmit={handleSubmit}>
              <div className="form-group">
                <label>Name</label>
                <input type="text" className="form-control" value={title} onChange={(e) => setTitle(e.target.value)} />
              </div>
              <div class="mb-3">
                <label for="todoDescription">Description</label>
                <textarea class="form-control is-invalid" 
                id="todoDescription" 
                onChange={(e) => setDescription(e.target.value)   }             
                value={description}
                ></textarea>
              </div>

              <div className="mb-3">
                <label htmlFor="status" className="form-label">Status</label>
                <select
                  className="form-control"
                  id="status"
                  name="status"
                  value={todo.status}
                  onChange={(e) => setStatus(e.target.value)   } 
                  required
                >
                  <option value="UNFINISHED">UNFINISHED</option>
                  <option value="COMPLETED">COMPLETED</option>
                </select>
              </div>

              <button type="submit" className="btn btn-primary">Save changes</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
}

export default UpdateTodoModal;