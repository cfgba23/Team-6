import Login from "views/Login.js";
import Home from "views/Home.js";
import Perfil from "views/Perfil.js"
import Icons from "views/Icons.js";
import Map from "views/Map.js";

var routes = [
  
  {
    path: "/home",
    name: "Home",
    icon: "tim-icons icon-chart-pie-36",
    component: <Home />,
    layout: "",
  },
  {
    path: "/eventos",
    name: "Eventos",
    icon: "tim-icons icon-atom",
    component: <Icons />,
    layout: "",
  },
  {
    path: "/cursos",
    name: "Cursos",
    icon: "tim-icons icon-pin",
    component: <Map />,
    layout: "",
  },
  {
    path: "/perfil",
    name: "Perfil",
    icon: "tim-icons icon-chart-pie-36",
    component: <Perfil />,
    layout: "",
  },
];
export default routes;