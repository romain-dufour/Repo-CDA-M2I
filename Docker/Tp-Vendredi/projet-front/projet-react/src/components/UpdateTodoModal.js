import React, { useState } from 'react';

function UpdateTodoModal({ todo, onSave, onCancel }) {
  const [name, setName] = useState(todo?.name);
  const [task, setTask] = useState(todo?.task);

  const handleSubmit = (e) => {
    e.preventDefault();
    onSave({id:todo.id, name, task });
  };

  return (
    <div className="modal" style={{ display: 'block', backgroundColor: 'rgba(0,0,0,0.5)' }}>
      <div className="modal-dialog">
        <div className="modal-content">
          <div className="modal-header">
            <h5 className="modal-title">Update Todo</h5>
            <button type="button" className="close" onClick={onCancel}>
              <span>&times;</span>
            </button>
          </div>
          <div className="modal-body">
            <form onSubmit={handleSubmit}>
              <div className="form-group">
                <label>Name</label>
                <input type="text" className="form-control" value={name} onChange={(e) => setName(e.target.value)} />
              </div>
              <div className="form-group">
                <label>Tache</label>
                <input type="text" className="form-control" value={task} onChange={(e) => setTask(e.target.value)} />
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