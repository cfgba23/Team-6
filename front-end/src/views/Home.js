import React from "react";
import classNames from "classnames";
import { Line, Bar } from "react-chartjs-2";
import { Button, ButtonGroup, Card, CardHeader, CardBody, CardTitle, DropdownToggle, DropdownMenu, DropdownItem, UncontrolledDropdown, Label, FormGroup, Input, Table, Row, Col, UncontrolledTooltip, } from "reactstrap";
import Event from "../components/events/Event";
import Course from "../components/course/Course"
import Credits from "../components/credits/Credits";

import {
  chartExample1,
  chartExample2,
  chartExample3,
  chartExample4,
} from "variables/charts.js";

function Home(props) {
  const [bigChartData, setbigChartData] = React.useState("data1");
  const setBgChartData = (name) => {
    setbigChartData(name);
  };
  return (
    <>
      <div className="content">
        <Row>
          <Col lg="4">
            <Card className="card-chart p-4">
              <Event />
              
            </Card>
          </Col>
          <Col lg="4">
            <Card className="card-chart p-4">
             <Course /> 
            </Card>
          </Col>
          <Col lg="4">
            <Card className="card-chart p-4">
              <Credits />
            </Card>
          </Col>
        </Row>
        <Row>
          <Col xs="12">
            <Card className="card-chart">
              <CardHeader>
                <Row>
                  <Col className="text-left" sm="6">
                    <CardTitle tag="h2">Programas</CardTitle>
                  </Col>
                  
                </Row>
              </CardHeader>
              <CardBody>
                <div>
                  <div>
                    
                  </div>
                </div>
                
              </CardBody>
            </Card>
          </Col>
        </Row>
      </div>
    </>
  );
}

export default Home;
