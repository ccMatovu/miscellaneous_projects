const keys = ["KeyA","KeyD","KeyF","KeyG","KeyH","KeyJ","KeyS","KeyW","KeyE","KeyT","KeyY","KeyU"];
document.addEventListener("keydown",function (event){

    if(keys.includes(event.code)){
        let audio = new Audio(event.key.toUpperCase()+".mp3");
        audio.play();

    } else {
        console.log(`Warning a key is pressed.`);
    }
});