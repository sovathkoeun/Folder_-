$(document).ready(function () {
    var results = "";
    db.collection('profile').get().then((data) => {
        data.forEach(iterm => {
            // console.log(iterm.data().name)
            results += `
        <div class ="card shadow mt-4">
          <div class ="card-header uppercase">
            <img src ="${iterm.data().img_profile}"  style ="border-radius:50%" width ="50px" height ="50px">
            ${iterm.data().name};
            <button class ="btn btn-danger btn-sm float-right" type ="button" onclick ="deleteUser()">delete</button>
            
          </div>
          <div class ="card-body">
          <img src ="${iterm.data().post_img}" class ="img-fluid rounded">
          </div>
        </div>
    `;
        })
        $('#results').append(results);
    });

    $('button').on("click",function(){
        var name =$('#name').val();
        var profile =$('#profile').val();
        var post =$('#post').val();
        db.collection('profile').add({
            name:name,
            img_profile:profile,
            post_img:post,
        })

    });

});