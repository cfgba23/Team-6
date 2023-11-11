import React from "react";
import { Card, CardHeader, CardBody, Row, Col } from "reactstrap";
import Event from "../components/events/Event";

let aux = [1,2,3,4,5, 6, 7, 8,9,10]
function Icons() {
  return (
    <>
      <div className="content">
        <Row>
          <Col md="12 row">
            {aux.map(() => {
              return (<div class="col-3 gap-2" style={{}}><Event /></div>)
            })}
          </Col>
        </Row>
      </div>
    </>
  );
}

export default Icons;
