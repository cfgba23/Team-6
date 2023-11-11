import React from "react";
import classNames from "classnames";
import { Line, Bar } from "react-chartjs-2";
import { Button, ButtonGroup, Card, CardHeader, CardBody, CardTitle, DropdownToggle, DropdownMenu, DropdownItem, UncontrolledDropdown, Label, FormGroup, Input, Table, Row, Col, UncontrolledTooltip, } from "reactstrap";

/* import {
  // chartExample1,
  chartExample2,
  chartExample3,
  chartExample4,
} from "variables/charts.js"; */

function Perfil(props) {
  /* const [bigChartData, setbigChartData] = React.useState("data1");
  const setBgChartData = (name) => {
    setbigChartData(name);
  }; */
  return (
    <>
      <div className="content">
        <Row>
          <Col xs="12">
            <Card className="card-chart">
              <CardHeader>
                <Row>
                  <Col className="text-left" sm="6">
                    <h5 className="card-category">Nombre del usuario</h5>
                    <CardTitle tag="h2">Datos del usuario:</CardTitle>
                  </Col>
                </Row>
              </CardHeader>
              <CardBody>
                {/* style={{  display: "grid",
                               gridTemplateColumns: "150px 150px",
                               gridTemplateRows: "auto",
                              }} */}
                <div className="col-12" >
                  <div style={{flexDirection: "row", display: "flex", gap:10}}>
                    <img  alt="imagen-usuario" style={{width: 100, height: 100}} src={require("../assets/img/profile.png")}/>
                    <div style={{}}>
                      <p>Nombre </p> <p style={{paddingLeft: 10 , alignSelf: "center"}}>Nombre Persona</p>
                      <p>Email </p> <p style={{paddingLeft: 10 , alignSelf: "center"}}>Email persona</p>
                      <p>Categoria </p> <p style={{paddingLeft: 10 , alignSelf: "center"}}>Categoria persona</p>
                    </div>
                  </div>
                </div> 
                <div className="chart-area" style={{marginLeft: 20, marginTop: 20, display: "flex", flexDirection: "column", height: "auto"}}>
                  <h3 style={{margin: 0}} >Certificados</h3>
                  <div className="certificado" style={{flexDirection: "row", display: "flex"}} >
                    <div style={{marginTop: 10, borderRadius : 10, width: 60, height: 60, backgroundColor: "#000", justifyContent: "center", alignItems: "center", display: "flex"}}>
                      <img  alt="imagen-usuario" style={{width: 35, height: 35}} src={require("../assets/img/reward.png")}/>
                    </div>
                    <p style={{paddingLeft: 10 , alignSelf: "center"}}>Nombre curso</p>
                  </div>
                  <div className="certificado" style={{flexDirection: "row", display: "flex"}} >
                    <div style={{marginTop: 10, borderRadius : 10, width: 60, height: 60, backgroundColor: "#F3B664", justifyContent: "center", alignItems: "center", display: "flex"}}>
                      <img  alt="imagen-usuario" style={{width: 35, height: 35}} src={require("../assets/img/reward.png")}/>
                    </div>
                    <p style={{paddingLeft: 10 , alignSelf: "center"}}>Nombre curso</p>
                  </div>
                  <div className="certificado" style={{flexDirection: "row", display: "flex"}} >
                    <div style={{marginTop: 10, borderRadius : 10, width: 60, height: 60, backgroundColor: "#1640D6", justifyContent: "center", alignItems: "center", display: "flex"}}>
                      <img  alt="imagen-usuario" style={{width: 35, height: 35}} src={require("../assets/img/reward.png")}/>
                    </div>
                    <p style={{paddingLeft: 10 , alignSelf: "center"}}>Nombre curso</p>
                  </div>
                </div> 
                <div className="chart-area" style={{marginLeft: 20, marginTop: 20, height: "auto"}}>
                  <h3 style={{margin: 0}}>Estado de cuenta</h3>
                  <p>Puede solicitar minicredito: </p> <p>SI</p>
                </div> 
                <div className="chart-area" style={{marginLeft: 20, marginTop: 20}}>
                  <h3 style={{marginBottom: 10}}>Soporte</h3>
                  <ul className="col-12">
                    <li>Instagram: </li>
                    <li>WhatsApp: </li>
                    <li>Mail: </li>
                    <li>Facebook: </li>
                    <li>Youtube: </li>
                    <li>Twitter: </li>
                    <li>LinkedIn: </li>
                  </ul>
                </div> 
              </CardBody>
            </Card>
          </Col>
        </Row>
      </div>
    </>
  );
}

export default Perfil;
