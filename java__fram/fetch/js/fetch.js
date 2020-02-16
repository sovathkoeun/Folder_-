// var url = "https://pixabay.com/api/?key=14001068-da63091f2a2cb98e1d7cc1d82&q=yellow+flowers&image_type=photo&pretty=true";
// fetch(url)
// .then(response =>response.json())
// .then(data =>{
//     console.log(data);
// })
// .catch(() =>{
//     console.log("always!")
// })

// var url = "https://pixabay.com/api/?key=14001068-da63091f2a2cb98e1d7cc1d82&q=yellow+flowers&image_type=photo&pretty=true";
// var ajax = new XMLHttpRequest();
// var method ="GET";
// var asyc =true;
// ajax.open(method,url,asyc);
// ajax.onload =()=>{
//     var data = JSON.parse(ajax.response);
//     data.hits.forEach(iterm =>{
//         console.log(iterm);
//     })
// }
// ajax.send();

var url = "https://pixabay.com/api/?key=14001068-da63091f2a2cb98e1d7cc1d82&q=yellow+flowers&image_type=photo&pretty=true";
async function getdata() {
    var response = await fetch(url);
    var data = await response.json();
    var result = document.querySelector('#result');
    data.hits.forEach(iterm =>{
        result.innerHTML +=`
            <div class ="card shadow-lg mt-4">
                <div class ="card-header">
                <button type="button" class="btn btn-primary btn-sm float-right" data-toggle="modal" data-target="#myModal${iterm.id}">views</button>
                    <img src ="${iterm.userImageURL}" class ="rounded-circle" width ="30px">
                </div>
                <div class ="card-body">
                <img src ="${iterm.largeImageURL}" class ="img-fluid">
                </div>
            </div>


            <div class="modal" id="myModal${iterm.id}">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
        <img src ="${iterm.userImageURL}" class ="rounded-circle" width ="30px">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
        <img src ="${iterm.largeImageURL}" class ="img-fluid">
        </div>
        
        
        
      </div>
    </div>
  </div>
        `;
    })
}
getdata();