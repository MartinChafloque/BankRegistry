import React, { useState } from "react";
import axios from "axios";
import { v4 as uuidv4 } from "uuid";
import Button from "react-bootstrap/Button";
import Form from "react-bootstrap/Form";
import { getTodaysDate } from "../utils/todayDate";

const TransferForm = ({ setUpdatedTransfer }) => {
  const [accountNumber, setAccountNumber] = useState("");
  const [amount, setAmount] = useState(0);

  const handleTransfer = async (e) => {
    e.preventDefault();
    const newTransfer = {
      id: uuidv4(),
      accountNumberRec: accountNumber,
      amount: amount,
      currency: "COP",
      date: getTodaysDate(),
    };

    const { data } = await axios.post(
      "http://localhost:8080/102932849291/transfers",
      newTransfer
    );
    setUpdatedTransfer(data);
  };

  return (
    <div className="mt-4">
      <h5>Realizar Transferencia</h5>
      <Form onSubmit={handleTransfer}>
        <Form.Group>
          <Form.Label>Número de Cuenta</Form.Label>
          <Form.Control
            type="text"
            placeholder="Digite el número de cuenta a enviar"
            value={accountNumber}
            onChange={(e) => setAccountNumber(e.target.value)}
          />
        </Form.Group>
        <Form.Group className="mt-3 mb-3">
          <Form.Label>Cantidad a Enviar</Form.Label>
          <Form.Control
            type="number"
            min="0"
            placeholder="Digite el monto a enviar"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </Form.Group>
        <Button className="w-100" variant="success" type="submit">
          Submit
        </Button>
      </Form>
    </div>
  );
};

export default TransferForm;
