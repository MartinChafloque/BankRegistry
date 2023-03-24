import React, { useEffect, useState } from "react";
import axios from "axios";
import Account from "../components/Account";
import TransferForm from "../components/TransferForm";
import TransferPanel from "../components/TransferPanel";

export const Home = () => {
  const [account, setAccount] = useState(null);
  const [transfers, setTransfers] = useState(null);
  const [updatedTransfer, setUpdatedTransfer] = useState(null);

  useEffect(() => {
    getAccount();
    getTransfers();
  }, [updatedTransfer]);

  const getAccount = async () => {
    const { data } = await axios.get("http://localhost:8080/102932849291");
    setAccount(data);
  };

  const getTransfers = async () => {
    const { data } = await axios.get(
      "http://localhost:8080/102932849291/transfers"
    );
    setTransfers(data);
  };

  if (!account) return <h2>Cargando cuenta...</h2>;
  if (!transfers) return <h2>Cargando transferencias...</h2>;

  return (
    <div>
      <h2 className="mb-3 text-center">Banco Pontifarra</h2>
      <Account account={account} />
      <TransferForm setUpdatedTransfer={setUpdatedTransfer} />
      <TransferPanel transfers={transfers} />
    </div>
  );
};
