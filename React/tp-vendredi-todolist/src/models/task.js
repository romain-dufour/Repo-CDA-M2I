class Task {

    static taskCount = 0
    _id

    constructor(name,deadline){
        this._id = ++Task.taskCount


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