package com.example.po;

import org.eclipse.emf.common.util.EList;

/**
 * @model
 */
public interface PurchaseOrder
{
  /**
   * @model
   */
  String getShipTo();

  /**
   * @model
   */
  String getBillTo();

  /**
   * @model containment="true"
   */
  EList<Item> getItems();
}
