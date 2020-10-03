package com.investor.entity;

import com.investor.models.ContactDetails;
import com.investor.models.DocumentRequest;
import com.investor.models.Name;
import com.investor.models.StockType;
import java.util.UUID;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "investorEntity")
@Getter
@Setter
@NoArgsConstructor
public class InvestorEntity {

  @Id
  @Column(name = "investor_id", nullable = false)
  private UUID investorId = UUID.randomUUID();

  @Column(name = "name")
  private Name name;

  @Column(name = "photo")
  private String photo;

  @Column(name = "stock_value")
  private String stockValue;

  @Column(name = "stock_id")
  private UUID stockId;

  @Column(name = "stock_type")
  private StockType stockType;

  @Column(name = "contact_details")
  private ContactDetails contactDetails;

  @Column(name = "investor_documents")
  private DocumentRequest documentRequest;

  @Column(name = "is_active", nullable = false)
  private Boolean isActive = false;

  @Column(name = "is_deleted", nullable = false)
  private Boolean isDeleted = false;
}
