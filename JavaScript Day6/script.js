function validateform() {
    var src = document.userform;
    var name = src.username;
    var password = src.password;
    if(name.value.length <1){
        alert("name shouldn't be less than 1 char")
        return false;
    }
    if(name.value == password.value){
        alert("name and username shouldn't be null")
        return false;
    }
}