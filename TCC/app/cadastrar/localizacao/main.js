var lat;
var lon;

function getLocation(){
    if(!navigator.geolocation)
        return null;
    navigator.geolocation.getCurrentPosition((pos) =>{
        lat = document.getElementById("lat").innerText = pos.coords.latitude;
        lon = document.getElementById("lon").innerText = pos.coords.longitude;
        initMap();
    })
}

function initMap() {
    const uluru = { lat: lat, lng: lon }
const map = new google.maps.Map(document.getElementById("map"), {
zoom: 17,
center: uluru
});

const marker = new google.maps.Marker({
position: uluru,
map: map,
});


}

window.initMap = initMap;

getLocation()
