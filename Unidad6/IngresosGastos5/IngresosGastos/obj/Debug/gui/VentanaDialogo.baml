   M S B A M L   `   `   `  ����  IngresosGastos'    !IngresosGastos.gui.VentanaDialogo   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  VentanaDialogo��5   	   $	��184��6    $	��594��6-    � 
ResizeMode$ NoResize=�69   .��5      � $��0,0,-8,0q�6   .+�5   
   �� $��Fecha:��6   $
��Left=�6!   $��
10,0,0,103q�6<   $��Bottom=�6P   $��43��6k   �� 5   
   $
��Left=�6   $��	70,0,0,99q�6+   $��Bottom=�6>   $	��129��6Y    J� RenderTransformOrigin$ 0.596,0.471&�6e   .��5      (  "System.Windows.Controls.DatePicker  -   5          Name$ DPFecha��5      $	��116��6�   $��Center=�6�      SelectedDate 6J   ��  �� Path$ Fecha� �� NotifyOnValidationError .  �� ValidatesOnDataErrors . 6�   5	      �� 5
   
   $��	Concepto:��6   $
��Left=�6$   $��194,0,0,105q�6?   $��Bottom=�6T   $��63��6o   �� 5   
   -   5         ��Name$ 
TBConcepto��5      $��27��6�   $��262,0,23,104q�6�   	 �� TextWrapping$
	 Wrap=�6�   $��Bottom=�6�   $��Center=�6�   ��6F   �� $ Concepto� .  . 6�   �� 5   
   $��Importe:��6   $
��Left=�6#   $��	10,0,0,74q�6>   $��Bottom=�6Q   �� 5   
   -   5        $ 	TBImporte��5      $��23��6�   $��	70,0,0,75q�6�   $��Bottom=�6�   $	��129��6�   $
��Left=�6�   
 �� TextAlignment$
 Right=�6�   $��Center=�6  $��Right=�64  ��6E   �� $ Importe� .  . 64  �� 5   
   -   5         ��Name$ 	BInsertar��5      $��Insertar��6$   $��	11,0,0,10q�67   $��19��6J   $��Bottom=�6V   $
��Left=�6q   $��75��6�   6�   �� 5   
   -   5        $ 	BCancelar��5      $��Cancelar��6$   $��
100,0,0,10q�67   $��19��6K   $��Bottom=�6W   $
��Left=�6r   $��75��6�   6�   �� 5   
   -   5         ��Name$ LBError��5      $�� ��6!   $��Center=�6,   $
��Left=�6P   $��	10,86,0,0q�6k   $	��Top=�6~   $ -0.105,-0.231&�6�   $	��564��6�   ���	#FFFD05056�   5      5      