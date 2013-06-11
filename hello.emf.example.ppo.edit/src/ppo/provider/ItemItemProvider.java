/** */package ppo.provider;import java.util.Collection;import java.util.List;import org.eclipse.emf.common.notify.AdapterFactory;import org.eclipse.emf.common.notify.Notification;import org.eclipse.emf.common.util.ResourceLocator;import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;import org.eclipse.emf.edit.provider.IItemLabelProvider;import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;import org.eclipse.emf.edit.provider.IItemPropertySource;import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;import org.eclipse.emf.edit.provider.ITreeItemContentProvider;import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;import org.eclipse.emf.edit.provider.ItemProviderAdapter;import org.eclipse.emf.edit.provider.ViewerNotification;import ppo.Item;import ppo.PpoPackage;/** * This is the item provider adapter for a {@link ppo.Item} object. * <!-- begin-user-doc --> * <!-- end-user-doc --> * @generated */public class ItemItemProvider	extends ItemProviderAdapter	implements		IEditingDomainItemProvider,		IStructuredItemContentProvider,		ITreeItemContentProvider,		IItemLabelProvider,		IItemPropertySource {	/**	 * This constructs an instance from a factory and a notifier.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	public ItemItemProvider(AdapterFactory adapterFactory) {		super(adapterFactory);	}	/**	 * This returns the property descriptors for the adapted class.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	@Override	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {		if (itemPropertyDescriptors == null) {			super.getPropertyDescriptors(object);			addProductNamePropertyDescriptor(object);			addQuantityPropertyDescriptor(object);			addUSPricePropertyDescriptor(object);			addCommentPropertyDescriptor(object);			addShipDatePropertyDescriptor(object);			addPartNumPropertyDescriptor(object);		}		return itemPropertyDescriptors;	}	/**	 * This adds a property descriptor for the Product Name feature.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	protected void addProductNamePropertyDescriptor(Object object) {		itemPropertyDescriptors.add			(createItemPropertyDescriptor				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),				 getResourceLocator(),				 getString("_UI_Item_productName_feature"),				 getString("_UI_PropertyDescriptor_description", "_UI_Item_productName_feature", "_UI_Item_type"),				 PpoPackage.Literals.ITEM__PRODUCT_NAME,				 true,				 false,				 false,				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,				 null,				 null));	}	/**	 * This adds a property descriptor for the Quantity feature.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	protected void addQuantityPropertyDescriptor(Object object) {		itemPropertyDescriptors.add			(createItemPropertyDescriptor				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),				 getResourceLocator(),				 getString("_UI_Item_quantity_feature"),				 getString("_UI_PropertyDescriptor_description", "_UI_Item_quantity_feature", "_UI_Item_type"),				 PpoPackage.Literals.ITEM__QUANTITY,				 true,				 false,				 false,				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,				 null,				 null));	}	/**	 * This adds a property descriptor for the US Price feature.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	protected void addUSPricePropertyDescriptor(Object object) {		itemPropertyDescriptors.add			(createItemPropertyDescriptor				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),				 getResourceLocator(),				 getString("_UI_Item_USPrice_feature"),				 getString("_UI_PropertyDescriptor_description", "_UI_Item_USPrice_feature", "_UI_Item_type"),				 PpoPackage.Literals.ITEM__US_PRICE,				 true,				 false,				 false,				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,				 null,				 null));	}	/**	 * This adds a property descriptor for the Comment feature.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	protected void addCommentPropertyDescriptor(Object object) {		itemPropertyDescriptors.add			(createItemPropertyDescriptor				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),				 getResourceLocator(),				 getString("_UI_Item_comment_feature"),				 getString("_UI_PropertyDescriptor_description", "_UI_Item_comment_feature", "_UI_Item_type"),				 PpoPackage.Literals.ITEM__COMMENT,				 true,				 false,				 false,				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,				 null,				 null));	}	/**	 * This adds a property descriptor for the Ship Date feature.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	protected void addShipDatePropertyDescriptor(Object object) {		itemPropertyDescriptors.add			(createItemPropertyDescriptor				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),				 getResourceLocator(),				 getString("_UI_Item_shipDate_feature"),				 getString("_UI_PropertyDescriptor_description", "_UI_Item_shipDate_feature", "_UI_Item_type"),				 PpoPackage.Literals.ITEM__SHIP_DATE,				 true,				 false,				 false,				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,				 null,				 null));	}	/**	 * This adds a property descriptor for the Part Num feature.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	protected void addPartNumPropertyDescriptor(Object object) {		itemPropertyDescriptors.add			(createItemPropertyDescriptor				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),				 getResourceLocator(),				 getString("_UI_Item_partNum_feature"),				 getString("_UI_PropertyDescriptor_description", "_UI_Item_partNum_feature", "_UI_Item_type"),				 PpoPackage.Literals.ITEM__PART_NUM,				 true,				 false,				 false,				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,				 null,				 null));	}	/**	 * This returns Item.gif.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	@Override	public Object getImage(Object object) {		return overlayImage(object, getResourceLocator().getImage("full/obj16/Item"));	}	/**	 * This returns the label text for the adapted class.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	@Override	public String getText(Object object) {		String label = ((Item)object).getProductName();		return label == null || label.length() == 0 ?			getString("_UI_Item_type") :			getString("_UI_Item_type") + " " + label;	}	/**	 * This handles model notifications by calling {@link #updateChildren} to update any cached	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	@Override	public void notifyChanged(Notification notification) {		updateChildren(notification);		switch (notification.getFeatureID(Item.class)) {			case PpoPackage.ITEM__PRODUCT_NAME:			case PpoPackage.ITEM__QUANTITY:			case PpoPackage.ITEM__US_PRICE:			case PpoPackage.ITEM__COMMENT:			case PpoPackage.ITEM__SHIP_DATE:			case PpoPackage.ITEM__PART_NUM:				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));				return;		}		super.notifyChanged(notification);	}	/**	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children	 * that can be created under this object.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	@Override	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {		super.collectNewChildDescriptors(newChildDescriptors, object);	}	/**	 * Return the resource locator for this item provider's resources.	 * <!-- begin-user-doc -->	 * <!-- end-user-doc -->	 * @generated	 */	@Override	public ResourceLocator getResourceLocator() {		return PrimerPOEditPlugin.INSTANCE;	}}