   M S B A M L   `   `   `  ����  IngresosGastos%    IngresosGastos.VentanaPrincipal   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  Ingresos y Gastos��5   	   $��336.3��6#   $	��525��62    � 
ResizeMode$ NoResize=�6>    � WindowStartupLocation$ CenterScreen=�6T   .��5      � $��0,0,-0.333,0.667q�6   .+�5   
   &   System.Windows.Controls.DataGrid  -   5          Name$ DataGridIngresosoGastos��5      $��10,10,9.333,149.333q�64      AutoGenerateColumns .  ��.  ��6Q   ��  �� Path$ ListaIngresosGastos�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5	      ,  &System.Windows.Controls.DataGridColumn   Width5  /System.Windows.Controls.DataGridLengthConverter$	 100 6%      Header$ FECHA��61   	   CanUserResize	 .  1  +System.Windows.Controls.DataGridBoundColumn
   Binding
 6@   �� $ Fecha�6_     5
      $	 200 6%   $ CONCEPTO��61      CanUserReorder .  
 6C   �� $ Concepto�6e     5      $ 90 6%   $ INGRESO��60    .  
 6A   �� $ Ingreso�   	CellStyle 5      �� 5      .�5      ��  �� Property � �� �� Value$ Right=�6U   6e   �� 5       � ��$ Center=�6S   6d   5      5        5      $ 90 6%   $ GASTO��60    .  
 6?   �� $ Gasto� 5      �� 5      .�5      ��  � ��$ Right=�6U   6e   �� 5       � ��$ Center=�6S   6d   5      5      5      �� 5   
   $��Fecha:��6   $
��Left=�6!   $��10,0,0,103.333q�6<   $��Bottom=�6T   $��43��6o   $��1��6z   �� 5   
   $��	Concepto:��6   $
��Left=�6$   $��194,0,0,105.333q�6?   $��Bottom=�6X   $��63��6s   $��1��6~   �� 5!   
   -   5         ��Name$ 
TBConcepto��5!      $��27��6&   $��262,0,9.333,104.333q�62    �� TextWrapping$
 Wrap=�6O   $��Bottom=�6c   $��Center=�6~   �� 5"   
   $��Importe:��6   $
��Left=�6#   $��10,0,0,74.333q�6>   $��Bottom=�6U   $��1��6p   �� 5#   
   -   5        $ 	TBImporte��5#      $��23��6%   $��70,0,0,75.333q�61   $�� ��6H   $��Bottom=�6P   $	��129��6k   $
��Left=�6w    �� TextAlignment$ Right=�6�   $��Center=�6�   $��Right=�6�   �� 5$   
   -   5         ��Name$ 	BInsertar��5$      $��Insertar��6$   $��10,0,0,10.333q�67   $��24��6N   $��Bottom=�6Z   $
��Left=�6u   $��75��6�   6�   �� 5%   
   -   5        $ 	BCancelar��5%      $��Cancelar��6$   $��105,0,0,10.333q�67   $��24��6O   $��Bottom=�6[   $
��Left=�6v   $��75��6�   $y�Hidden=�6�   (  "System.Windows.Controls.DatePicker  5&   
   -   5          Name$ DPFecha��5&      $
��Left=�6&   $��70,0,0,104.333q�6A   $	��129��6Y   $��27��6e   $��Bottom=�6q   �� 5'   
   -   5         ��Name$ LBError��5'      $�� ��6!   $��Center=�6,   $
��Left=�6P   $��
15,237,0,0q�6k   $	��Top=�6    J� RenderTransformOrigin$ -0.105,-0.231&�6�   $	��494��6�   ���	#FFFD05056�   5(      5)      