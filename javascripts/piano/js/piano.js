const keys = document.querySelectorAll('.key');
// console.log(keys);
keys.forEach(key=>{
    // console.log(key);
    key.addEventListener('click',() =>  onPlayPiano(key));
});
function onPlayPiano(key){
    const audio = document.getElementById(key.dataset.note);
    console.log(audio);
    audio.play();
}