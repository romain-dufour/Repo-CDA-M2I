class Task {

    static taskCount = 0
    _id

    _isDone = false

    constructor(_name,_deadline){
        this._id = ++Task.taskCount
        this._isDone = this._isDone

    }

    get id() {
        return this._id
    }
    get name(){
        return this._name
    }
    get deadline(){
        return this._deadline
    }
}

export default Task