export function dateMiddleware (req, res, next) {
    req.dateRequest = new Date();
    next()
}

export function queryLogger(req, res, next) {
    console.log(req.dateRequest, req.query);
    next();
}

export function authMiddleware(req, res, next) {
    console.log("Je suis dans le middleware auth");
    let user = req.body.user;
    if(user !== 'admin') {
        res.sendStatus(401);
    }

    let password = req.body.password;
    if (password !== "password") {
        res.sendStatus(401);
    } 

    next();
}