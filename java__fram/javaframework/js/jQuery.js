$(document).ready(function () {
  var results = "";
  db.collection('table').get().then((data) => {
    data.forEach(iterm => {
      results += `
            <div class ="card shadow mt-4" id ="card">
                <div class ="card-header">
                    <img src ="${iterm.data().profile}" style ="border-radius:50%" width ="50px" height ="50px">
                    ${iterm.data().name}
                    <button type="button" class="btn btn-sm btn-warning float-right" data-toggle="modal" data-target="#myModal${iterm.id}">Views</button>
                
                  <!-- The Modal -->
                  <div class="modal fade" id="myModal${iterm.id}">
                    <div class="modal-dialog">
                      <div class="modal-content">
                      
                        <!-- Modal Header -->
                        <div class="modal-header">

                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        
                        <!-- Modal body -->
                        <div class="modal-body">
                        <img src ="${iterm.data().post}" class ="img-fluid rounded">
                        
                        
                        </div>

                      </div>
                    </div>
                  </div>
                  

                    

                </div>
                <div class ="card-body">
                <img src ="${iterm.data().post}" class ="img-fluid rounded">
                ${iterm.data().description}
                </div>
                <div class ="card-footer">
                <button class ="btn btn-danger btn-sm float-right" type ="button" onclick ="deleteUser('${iterm.id}')"  id ="btn-delete">delete</button>
                </div>
            </div>
          
           `;
    })
    $("#card").append(results);
  })

  $('#add').on('click', function () {
    var name = $('#name').val();
    var profile = $('#profile').val();
    var post = $('#post').val();
    var description = $('#description').val();
    db.collection('table').add({
      name: name,
      profile: profile,
      post: post,
      description: description,
    })

  });

  $('#btn-delete').click(function () {
    $("#card").removeData();
  })
})
function deleteUser(id) {
  db.collection('table').doc(id).delete();
}