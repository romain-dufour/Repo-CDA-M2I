class Task {

    static taskCount = 0
    _id

    constructor(_name,_deadline){
        this._id = ++Task.taskCount
        this._name=_name
        this._deadline=_deadline

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